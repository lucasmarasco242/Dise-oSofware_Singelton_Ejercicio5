Ejercicio 5 - Administrador de Dispositivos de Hardware Únicos

Explicación del programa

En este ejercicio se creó una clase llamada ControladorHardware que aplica el patrón Singleton para garantizar un único punto de acceso al puerto serial físico y evitar fallas críticas por comandos simultáneos.
La clase cuenta con:
- Una variable estática privada llamada instancia.
- Atributos privados (estado y disponible) para controlar el estado operacional del dispositivo.
- Un constructor privado para impedir estrictamente la duplicación de la instancia en memoria.
- Un método estático público llamado getInstancia() que devuelve siempre la misma referencia operativa única.
- Métodos públicos para enviar comandos, verificar disponibilidad y consultar el estado actual.

Luego, dentro del método main, se obtienen dos referencias al controlador:
ControladorHardware d1 = ControladorHardware.getInstancia();
ControladorHardware d2 = ControladorHardware.getInstancia();

Finalmente, se utilizó System.out.println() para comprobar que ambas referencias son iguales, verificar la disponibilidad y simular el envío de un comando por consola.

Lógica utilizada

La lógica del programa consiste en:
- Bloquear la instanciación externa mediante un constructor privado para proteger el recurso físico exclusivo.
- Controlar el acceso global a través de getInstancia() para asegurar que cualquier módulo obtenga exactamente la misma referencia operativa.
- Validar el estado operacional y la disponibilidad antes de procesar el envío de instrucciones al puerto serial.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
¿Es la misma instancia?: true
¿Dispositivo disponible?: true
Estado actual: Listo
Enviando comando al puerto serial: MOVER_BRAZO_IZQUIERDO

Captura de pantalla

<img width="597" height="201" alt="image" src="https://github.com/user-attachments/assets/c31e0ed1-1039-4bb4-8340-7743b45273f1" />
