public class Main {

    public static void main(String[] args) {
    Context context =new Context();
    concrete_Statu_A concrete_statu_a =new concrete_Statu_A();
    concrete_statu_a.handle(context);
    System.out.println(context.getStatu().toString());
    concrete_Statu_B concrete_statu_b =new concrete_Statu_B();
    concrete_statu_b.handle(context);
    System.out.println(context.getStatu().toString());
    }
}
