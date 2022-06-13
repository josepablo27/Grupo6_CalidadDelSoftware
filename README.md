# Grupo6_CalidadDelSoftware

La página web que se utilizará para realizar las pruebas es la siguiente:

https://www.automationexercise.com/brand_products/Biba

## Instalación de JDK

1. Entrar al siguiente enlace:

https://www.oracle.com/java/technologies/downloads/

2. Una vez dentro, seleccionar la versión JDK 17 para el sistema operativo correspondiente.

3. Dar click en el enlace para que comience la instalación del archivo .exe.

4. Ejecutar el instalador (archivo descargado) y en la primera ventana seleccionar la opción **"Next"**.

5. Seleccionar el directorio en donde se desea instalar el JDK y oprimir **"Next"**.

6. Por útlimo, cerrar el asistente en el botón de **"Close"** para finalizar la instalación.

## Instalación de Eclipse IDE

1. Entrar al siguiente enlace:

https://www.eclipse.org/downloads/

2. Seleccionar la versión de eclipse más reciente.

3. Oprimir en la opción de **"Download"**.

4. Abrir el ejecutable y en la primera ventana escoger la opción de **"Eclipse IDE for Java Developers"**.

5. Elegir el directorio donde se desea instalar y seleccionar la opción de **"Install"**.

6. Aceptar los términos y condiciones.

7. Presionar la opción de **"Launch"**.

8. Seleccionar la dirección donde desea que se guarden los proyectos y escoger la opción **"Launch"**.

## Instalación de las librerias de Selenium

1. Entrar al siguiente enlace:

https://www.selenium.dev/downloads/

2. Descargar tanto el **"Server"** como la versión **"Clients and WebDriver"** para java.

3. Extraer todo del archivo comprimido descargado.

## Configurar Selenium en Eclipse

1. Ingresar a eclipse y crear un nuevo proyecto, seleccionando la opción de **"Java Project"**, elegiendo el nombre adecuado y por último oprimir la opción de **"Finish"**.

2. Dar botón derecho sobre el proyecto y escoger la opción de **"New"** y seguidamente **"Package"** para crear un nuevo paquete.

3. En la ventana se coloca el nombre que se desee y se oprime el botón de **"Finish"**.

4. Nuevamente se da botón derecho al proyecto y se selecciona la opción de **"New"** y seguidamente **"Class"** para crear una nueva clase.

5. Se selecciona un nombre para la clase que sería la prueba que se desea automatizar, se da click para activar la opción de **"public static void main(String[] args)"**, y se oprime el botón de **"Finish"**.

6. Dar click derecho sobre el proyecto, seleccionar la opción **"Build Path"** y seguidamente **"Configure Build Path"**.

7. En la ventana se seleccina el apartado de **"libraries"** que aparece en la parte superior, seguidamente se da click en **"Classpath**"", y por útlimo se elige la opción de **"Add External JARs"** ubicada en la parte derecha de la ventana.

8. Se seleccionan todas las librerías descargadas, incluidas las ubicadas en todas las carpetas dentro del archivo comprimido.

9. Una vez seleccionadas todas se oprime el botón **"Apply and Close"**.

## Instalación del Chrome Driver 

1. Entrar al siguiente enlace:

https://chromedriver.chromium.org/downloads

2. Buscar la versión compatible con el Google Chrome del ordenador.

3. Para verificar la versión de Chrome se ingresa a este, se selecciona las opciones ubicadas en la parte superior derecha, seguidamente en **"Help"** y por último **"About Google Chrome"**.

4. Una vez instalada la versión adecuada, se descomprime el contenido.

## Configuración de Repositorio en Eclipse

1. Dar click derecho en el proyecto previamente creado y seleccionar la opción **"Team"** y posteriormente **"Share Proyect"**.

2. Se selecciona el directorio y luego se da click en la opción **"Create Repository"**, con esto se crea el repositorio de github.

3. En la esquina superior derecha se selecciona la opción **"Git Repositories"**.

4. En **"Unstanged Changes"** se eligen los archivos para realizar el push y se arrastran hacia abajo a la opción **"Staged Changes"**.

5. A la derecha, en **"Commit Message"** se escribe un nombre alusivo al commit que está por realizarse y se selecciona la opción **"Commit"**.

6. Posteriormente se da click derecho en el proyecto, se selecciona **"Team"**, y luego en la opción **"Push Master"**.

7. En el espacio para **"URL"** pegamos el link del repositorio creado previamente en github.com, vemos que varios espacios se autocompletan, y en el apartado de **"Authentication"** se completan los respectivos espacios con el correo electrónico y la contraseña; ambos utilizados en la cuenta de github.

8. Se selecciona la opción **"Add All Branches Spec"** y finalmente en el botón **"Finish"**.
