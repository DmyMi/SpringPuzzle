package cloud.dmytrominochkin.puzzle.component;

import cloud.dmytrominochkin.puzzle.annotation.LogPerformance;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogPerformanceInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        if (methodInvocation.getMethod().isAnnotationPresent(LogPerformance.class)) {
            System.out.println(methodInvocation.getMethod().getName() + " -- invocation started");
            long time = System.currentTimeMillis();
            Object object = methodInvocation.proceed();
            System.out.println(
                    methodInvocation.getMethod().getName() +
                            " -- invocation finished. Processing time: " +
                            (System.currentTimeMillis() - time));
            return object;
        } else {
            return methodInvocation.proceed();
        }
    }
}
