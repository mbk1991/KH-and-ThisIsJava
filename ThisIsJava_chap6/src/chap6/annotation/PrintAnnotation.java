package chap6.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//정보제공, 에러체크, 특정기능
//엘리먼트 엘리먼트 엘리먼트 , 타입 이름 default 값
// 코드에서 @AnnotationName("값") @AnnotationName(value = "값",elementName=3) 등으로 초기화가능.
//어노테이션 적용대상은 ElementType 열거상수로 정의
//어노테이션에도 어노테이션을 달 수 있음.
//@Target 어노테이션 적용대상
//@Retention 어노테이션 유지정책


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
