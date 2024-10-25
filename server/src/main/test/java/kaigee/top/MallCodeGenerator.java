package kaigee.top;

import io.qifan.infrastructure.generator.processor.QiFanGenerator;

public class MallCodeGenerator {

  public static void main(String[] args) {
    QiFanGenerator qiFanGenerator = new QiFanGenerator();
    qiFanGenerator.process("kaigee.top", "template");
  }
}
