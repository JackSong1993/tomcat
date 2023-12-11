/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

/**
 * {@snippet lang = c : * int (*SSL_CTX_set_default_passwd_cb$cb)(char*,int,int,void*);
 * }
 */
public interface SSL_CTX_set_default_passwd_cb$cb {

    FunctionDescriptor $DESC = FunctionDescriptor.of(JAVA_INT, openssl_h.C_POINTER, JAVA_INT, JAVA_INT,
            openssl_h.C_POINTER);

    int apply(MemorySegment _x0, int _x1, int _x2, MemorySegment _x3);

    MethodHandle UP$MH = openssl_h.upcallHandle(SSL_CTX_set_default_passwd_cb$cb.class, "apply", $DESC);

    static MemorySegment allocate(SSL_CTX_set_default_passwd_cb$cb fi, Arena scope) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, scope);
    }

    MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    static SSL_CTX_set_default_passwd_cb$cb ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (MemorySegment __x0, int __x1, int __x2, MemorySegment __x3) -> {
            try {
                return (int) DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}