package com.king.kingapiinterface.aop;


import org.aspectj.lang.annotation.Aspect;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author King
 * @Description:
 */
@RestControllerAdvice
@Aspect
public class InvokeCountAOP {

//    @Resource
//    private UserInterfaceInfoService userInterfaceInfoService;
//
//    public void doInvokeCount(){
//        @Before("execution(* com.example.myapp.controller.*.*(..))")
//        public void logBefore() {
//            // 在方法执行前执行该方法
//            System.out.println("Before method execution");
//        }
//
//        @AfterReturning(pointcut = "execution(* com.example.myapp.service.*.*(..))", returning = "result")
//        public void logAfter(Object result) {
//            // 在方法执行后执行该方法
//            System.out.println("After method execution, result: " + result);
//        }
//    }
}
