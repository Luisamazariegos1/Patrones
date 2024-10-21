public class MVCDemo {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();   // Inicializa el modelo
        TaskView view = new TaskView();       // Inicializa la vista
        TaskController controller = new TaskController(model, view); // Inicializa el controlador

        // Simulación de interacción del usuario
        controller.addTask("Realizar proyectos");
        controller.addTask("Salir a correr");
        controller.addTask("Sacar al perro ");
    }
}
