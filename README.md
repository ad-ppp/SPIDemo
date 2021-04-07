# [SPI](https://docs.oracle.com/javase/tutorial/sound/SPI-intro.html)
Introduction to the Service Provider Interfaces

## demo
spi1:
    手动注册 services

## log
```shell
-> % ls app/build/intermediates/javac/debug/classes/META-INF/services
com.jacky.study.spi.demo.sp3.IName

-> % ls app/build/intermediates/java_res/debug/out/META-INF/services
com.jacky.study.spi.demo.spi1.IHello
```

## 配置 auto-service logAble

```groovy
javaCompileOptions {
    annotationProcessorOptions {
        arguments = ["debug": "true"]
    }
}
```


build phase log
```shell
> Task :app:compileDebugJavaWithJavac
注: [com.google.auto.service.AutoService]
注: [com.jacky.study.spi.demo.sp3.Jacky, com.jacky.study.spi.demo.sp3.Helen]
注: provider interface: com.jacky.study.spi.demo.sp3.IName
注: provider implementer: com.jacky.study.spi.demo.sp3.Jacky
注: provider interface: com.jacky.study.spi.demo.sp3.IName
注: provider implementer: com.jacky.study.spi.demo.sp3.Helen
注: Working on resource file: META-INF/services/com.jacky.study.spi.demo.sp3.IName
注: Looking for existing resource file at file:${projectDir}/app/build/intermediates/javac/debug/classes/META-INF/services/com.jacky.study.spi.demo.sp3.IName
注: Resource file did not already exist.
注: New service file contents: [com.jacky.study.spi.demo.sp3.Helen, com.jacky.study.spi.demo.sp3.Jacky]
注: Wrote to: file:${projectDir}/app/build/intermediates/javac/debug/classes/META-INF/services/com.jacky.study.spi.demo.sp3.IName
```

## Thanks
    - https://www.youtube.com/watch?v=iLPIUaNV-Kc
    - [ServiceLoader使用看这一篇就够了](https://www.jianshu.com/p/7601ba434ff4)
    - [AutoService](https://github.com/google/auto/tree/master/service)