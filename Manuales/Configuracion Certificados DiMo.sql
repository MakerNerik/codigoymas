===== Pasos para la configuración del componente AdapterDiMo Certificados =====
--========================================================================================================================================================================================================12/02/2025

===== Pasos para la configuración del componente AdapterDiMo =====
Subir documentos a los servidores
{    00000100000199901209
  1.- Necesitamos certificados con extenciones (cve/key)(cer/crt) y su frase de seguridad.
  2.- Al tener estos certificados los subimos con ayuda de WinScp
  3.- En Moba, necesitamos permisos de lectura escritura y ejecución en nuestro usuario.	

	--CAMBIAR SI ES NECESARIO EL NOMBRE DE LA CARPETA
	    /opt/jboss/EAP-7.4.0/spei/PrincipalConBitacora/adapterDIMO_CertLongMenorInvalido
	--CAMBIAR NOMBRE DE LA CARPETA
		adapterDIMO_Gem_Valido_test	
	-- CAMBIAR JAR
		AdapterWSClient-1.0.1-SNAPSHOT.jar
		AdapterWSClient-1.0.1-SNAPSHOT.jar
	-- EJECUTAR LOS SIGUIENTES COMANDOS EN LA RUTA A NIVEL DE LA CARPETA --> adapterDIMO_Gem_Valido_test		
}
Generar los archivos 
{
   1.- Generar el archivo secret (secret.p12) con ayuda del jar (crypto-tools-1.0-SNAPSHOT.jar), con alias “bancoppelDimo” y password “bancoppel”   
   java -jar crypto-tools-1.0-SNAPSHOT.jar pkcs12 gen-secret --alias bancoppelDimo --ks-password bancoppel

 
/* 2.-ESTE CERTIFICADO NO CAMBIA - ES DE BANXICO *****************************/     
   java -jar crypto-tools-1.0-SNAPSHOT.jar pkcs12 import-cert --alias 00000100000199901329 --ks-password bancoppel --cert-file /opt/jboss/EAP-7.4.0/spei/GemeloConBitacora/adapterDIMO_Gem_Valido/certificados/00000100000199901329.cer --keystore trust.p12 
   
/* 3.- Generamos el archivo bancoppel.pfx exportando la clave del certificado de la Instancia B (00000100000199901209) ****************/
   openssl pkcs12 -export -out bancoppel.pfx -inkey /opt/jboss/EAP-7.4.0/spei/GemeloConBitacora/adapterDIMO_Gem_Valido/certificados/00000100000199901209.cve -in /opt/jboss/EAP-7.4.0/spei/GemeloConBitacora/adapterDIMO_Gem_Valido/certificados/00000100000199901209.crt -name 00000100000199901209
    pass del certificado propio **** (3 veces).

   
   4.- Generamos el archivo .p12, importando el keystore del archivo (bancoppel.pfx) creado en el paso anterior.   
		keytool -importkeystore -srckeystore bancoppel.pfx -srcstoretype PKCS12 -destkeystore 00000100000199901209.p12 -deststoretype PKCS12 -alias 00000100000199901209		
		pass almacen claves destino(2 veces): bancoppel
		pass almacen claves origen(propio certificado): 12345
 
   5.- Con la ayuda del componente crypto-tools-1.0-SNAPSHOT.jar, importamos el certificado 00000100000199901209 al keystore trust.p12
	   java -jar crypto-tools-1.0-SNAPSHOT.jar pkcs12 import-cert --alias 00000100000199901209 --ks-password bancoppel --cert-file /opt/jboss/EAP-7.4.0/spei/GemeloConBitacora/adapterDIMO_Gem_Valido/certificados/00000100000199901209.crt --keystore trust.p12      
	           	   
   6.- Con ayuda del componente crypto-tools-1.0-SNAPSHOT.jar, ciframos la contraseña “bancoppel”
	   java -jar crypto-tools-1.0-SNAPSHOT.jar pkcs12 enc-password --alias bancoppelDimo --ks-password bancoppel	   		
		pass: bancoppel (2 veces)				
		
		
		{AES_256}hBSY1zpSostm/rx/8SpPbYe4xgg+nM/j03tLc5j6e2/0TH3GK4w6KnvlU4Y7fl7t09Eey8A=

-- Levantar Dimo --
{
    1.-Validar que el servicio de Dimo este abajo.
    	ps -fea | grep java
    	
    2.-Levantar Dimo, entrar a la carpeta con el certificado deseado y ejecutar
    	java -jar AdapterWSClient-0.0.1-SNAPSHOT.jar > adapter.out &
		java -jar -Dlogging.config=file:logback-spring.xml AdapterWSClient-1.0.1-SNAPSHOT.jar &

}
