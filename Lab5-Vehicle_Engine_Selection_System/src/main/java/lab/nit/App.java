package lab.nit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) 
    {
      AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
      Engine engine = ctx.getBean(Engine.class);
      engine.start();
      ctx.close();
    }
}
