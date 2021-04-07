package com.jacky.study.spi.demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jacky.study.spi.demo.sp3.IName;
import com.jacky.study.spi.demo.spi1.IHello;
import com.twelvemonkeys.imageio.plugins.psd.PSDImageReaderSpi;

import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.textView).setOnClickListener(v -> {
            final ServiceLoader<IName> load = ServiceLoader.load(IName.class);
            for (IName iName : load) {
                System.out.println(iName.getName());
            }
        });
    }

    // third part demo
    private void demo_spi2() {
        final ServiceLoader<PSDImageReaderSpi> load = ServiceLoader.load(PSDImageReaderSpi.class);
        for (PSDImageReaderSpi item : load) {

        }
    }

    // 手动注入spi in /src/main/resources/META-INF/services/
    private void demo_spi1() {
        ServiceLoader<IHello> serviceLoader = ServiceLoader.load(IHello.class);
        for (IHello hello : serviceLoader) {
            System.out.println(hello.sayHello());
        }
    }
}