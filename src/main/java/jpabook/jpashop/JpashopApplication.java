package jpabook.jpashop;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpashopApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpashopApplication.class, args);
    }


    @Bean
    Hibernate5Module hibernate5Module () {
        /**
         * Hibernate5Module 설정으로 강제로 LazyLoading 해버린다.
         */
        Hibernate5Module hibernate5Module = new Hibernate5Module();
        hibernate5Module.configure(Hibernate5Module.Feature.FORCE_LAZY_LOADING, true);

        // 그대로 리턴하면 무시 (기본설정)
        return new Hibernate5Module();
    }
}
