package Exception.demo02.MyException;
/*
    自定义异常
    格式：
        public class xxxException extends Exception|RuntimeException{
            空参构造方法
            一个带异常信息的构造方法
        }
     注意：以Exception结尾，说明是异常类
 */
public class RegisterException extends /*Exception*/RuntimeException{
    public RegisterException(){}
    public RegisterException(String message){
        super(message);

    }

}
