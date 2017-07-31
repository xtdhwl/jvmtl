package net.shenru.agent;

import java.lang.instrument.*;
import java.security.*;
import java.lang.*;
import java.nio.file.*;

public class ClassLogger implements ClassFileTransformer{

    @Override
    public byte[] transform(ClassLoader loader, String className,Class<?> classBeingRedefined,
            ProtectionDomain protectionDomain,byte[] classfileBuffer) throws IllegalClassFormatException{
        try{
            System.out.println("ClassLogger Path:" + this.getClass().getClassLoader().getResource(".").getPath());
            String filePath =  this.getClass().getClassLoader().getResource(".").getPath() + "classes/" + className + ".class";
            Path path = Paths.get(filePath);
            System.out.println("path:" + filePath);
            Files.write(path, classfileBuffer);
        }catch(Throwable ignored){
            ignored.printStackTrace();
        }finally{
            return classfileBuffer;
        }
    }
}
