public class LoginForm extends AbstractButton{
    AbstractButton CircleButton = new AbstractButton() {
        @Override
        void view() {
            super.view();
            System.out.println("圆按钮");
        }
    };
    AbstractButton RectangleButton = new AbstractButton(){
        @Override
        void view() {
            super.view();
            System.out.println("方按钮");
    }
    };
    void display(){
            CircleButton.view();
            RectangleButton.view();
        }
}

