# Ejercicios de POO en Kotlin

Soluciones para los 25 ejercicios del material. Cada ejercicio tiene su propio archivo `Main.kt`, su propio `main()` y un paquete separado. Al compilar un archivo solo se ejecuta ese ejercicio; no hay menu ni una ejecucion que recorra todos.

## Ejecutar en Windows

Desde la carpeta del proyecto, compila solo el archivo que quieras ejecutar. Por ejemplo, para el ejercicio 1:

```powershell
New-Item -ItemType Directory -Force build | Out-Null
& ".tools\kotlin\kotlinc\bin\kotlinc.bat" "src\main\kotlin\ejercicios\ejercicio01\Main.kt" -include-runtime -d "build\ejercicio01.jar"
if ($LASTEXITCODE -eq 0) { java -jar "build\ejercicio01.jar" }
```

Para otro ejercicio, usa el archivo de su carpeta `ejercicioNN` y cambia el nombre del JAR. Por ejemplo, el ejercicio 25 esta en `src/main/kotlin/ejercicios/ejercicio25/Main.kt`. El compilador Kotlin esta en `.tools/kotlin` y Java debe estar disponible en el `PATH`.

## Contenido

- `ejercicio01`-`ejercicio04`: modificadores de acceso, encapsulacion, clases nested e inner.
- `ejercicio05`-`ejercicio09`: data classes, coordenadas y jerarquias sealed.
- `ejercicio10`-`ejercicio19`: herencia, clases abstractas e interfaces.
- `ejercicio20`-`ejercicio23`: figuras, dibujo, extension de distancia y lienzo con historial.
- `ejercicio24`-`ejercicio25`: visibilidad por paquete/modulo y comparacion entre clases normales y data classes.

Los ejercicios 20 y 22 se muestran como dos soluciones independientes: el 20 usa base/altura y el 22 usa dos puntos. Cada ejercicio esta en su propio paquete para que sus clases puedan llamarse igual sin mezclarse. El setter `internal` del ejercicio 17 demuestra visibilidad a nivel de modulo.

La contrasena de `UsuarioSistema` solo ilustra encapsulacion con `private`; una aplicacion real debe almacenar hashes con sal mediante una funcion especializada, nunca texto plano.
