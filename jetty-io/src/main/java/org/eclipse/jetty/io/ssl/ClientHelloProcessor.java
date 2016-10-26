//
//  ========================================================================
//  Copyright (c) 1995-2016 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.io.ssl;

import java.nio.ByteBuffer;

import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;

public interface ClientHelloProcessor
{
    public static final ClientHelloProcessor NOOP = new ClientHelloProcessor(){};

    public default boolean preProcess(ByteBuffer buffer, SSLEngine sslEngine) throws SSLException
    { 
        return true; 
    }

    public default void postProcess(SSLEngine sslEngine) throws SSLException
    {
        
    }
}
