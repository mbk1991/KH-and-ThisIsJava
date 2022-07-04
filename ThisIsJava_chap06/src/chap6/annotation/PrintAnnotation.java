package chap6.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//��������, ����üũ, Ư�����
//������Ʈ ������Ʈ ������Ʈ , Ÿ�� �̸� default ��
// �ڵ忡�� @AnnotationName("��") @AnnotationName(value = "��",elementName=3) ������ �ʱ�ȭ����.
//������̼� �������� ElementType ���Ż���� ����
//������̼ǿ��� ������̼��� �� �� ����.
//@Target ������̼� ������
//@Retention ������̼� ������å


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
