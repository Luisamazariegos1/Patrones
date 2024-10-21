public class MVCDemo {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);


        controller.addTask("Realizar proyectos");
        controller.addTask("Salir a correr");
        controller.addTask("Sacar al perro ");
    }
}
