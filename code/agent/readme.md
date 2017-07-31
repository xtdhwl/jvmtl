gcc agent.c -I/Library/java/JavaVirtualMachines/jdk1.8.0_51.jdk//Contents/Home/include  -I/Library/java/JavaVirtualMachines/jdk1.8.0_51.jdk//Contents/Home/include/darwin -shared -fPIC -o ./libtestagent.so
clang agent.c -I/Library/java/JavaVirtualMachines/jdk1.8.0_51.jdk//Contents/Home/include  -I/Library/java/JavaVirtualMachines/jdk1.8.0_51.jdk//Contents/Home/include/darwin -shared -fPIC -o ./build/libs/libagent.dylib

-javaagent:/Users/xtdhwl/Workspace/shenru-agent2/build/libs/libagent.so
-agentlib:Agent=/Users/xtdhwl/Workspace/shenru-agent2/build/libs/libagent
-agentpath:/Users/xtdhwl/Workspace/shenru-agent2/build/libs/libagent.dylib