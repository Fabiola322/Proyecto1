## Proyecto1 - Técnicas de Programación Orientada a Objetos

Este repositorio se creó para el curso "Técnicas de programación orientada a objetos" con dos objetivos principales:

- Documentar ejemplos sencillos en Java.
- Mostrar el uso básico de Git para versionado (commit, branch, push, pull).

Estructura del repositorio

- `POO_git_casos/`
	- `caso_1/` - Contiene `UsuarioSimple.java` (ejemplo básico de clase/uso de objetos).
	- `caso_2/` - Contiene `EstudianteInteractivo.java` (ejemplo con entradas/lectura por consola).
	- `caso_3/` - Contiene `BancoApp.java` (ejemplo más elaborado con lógica de aplicación sencilla).

Cómo compilar y ejecutar (Windows con bash.exe o cualquier terminal con Java instalado)

1. Abrir una terminal en la raíz del proyecto.

2. Compilar un caso (ejemplo para `caso_1`):

```bash
javac POO_git_casos/caso_1/UsuarioSimple.java
java -cp POO_git_casos/caso_1 UsuarioSimple
```

3. Compilar y ejecutar los otros casos (reemplazar paths y nombres de clase según corresponda):

```bash
javac POO_git_casos/caso_2/EstudianteInteractivo.java
java -cp POO_git_casos/caso_2 EstudianteInteractivo

javac POO_git_casos/caso_3/BancoApp.java
java -cp POO_git_casos/caso_3 BancoApp
```

Notas útiles

- Asegúrate de tener instalado Java (JDK) y que `javac` y `java` estén en el PATH.
- Si las clases están en paquetes, compila desde la raíz respetando la estructura de paquetes y ejecuta usando el nombre completo del paquete.
- Para practicar Git: crea una rama, haz cambios, commitea y haz push a tu repositorio remoto.

Contacto / Autor

Repositorio creado por estudiantes del curso.

---
Pequeña guía rápida de comandos Git (ejemplo):

```bash
# inicializar (si no está inicializado)
git init
git add .
git commit -m "Initial commit: agregar casos de ejemplo en Java"
git branch -M main
git remote add origin <url-del-repositorio>
git push -u origin main
```

Gracias — usa este repositorio para probar, aprender y versionar tus ejercicios en Java.

