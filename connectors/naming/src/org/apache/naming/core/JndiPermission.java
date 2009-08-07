/*
 *  Copyright 1999-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.naming.core;

import java.security.BasicPermission;

/**
 * Java SecurityManager Permission class for JNDI name based file resources
 * <p>
 * The JndiPermission extends the BasicPermission.
 * The permission name is a full or partial jndi resource name.
 * An * can be used at the end of the name to match all named
 * resources that start with name.  There are no actions.</p>
 * <p>
 * Example that grants permission to read all JNDI file based resources:
 * <li> permission org.apache.naming.JndiPermission "*";</li>
 * </p>
 *
 * @author Glenn Nielsen
 * @version $Revision$ $Date$
 */

public final class JndiPermission extends BasicPermission {

    // ----------------------------------------------------------- Constructors

    /**
     * Creates a new JndiPermission with no actions
     *
     * @param String - JNDI resource path name
     */
    public JndiPermission(String name) {
        super(name);
    }

    /**
     * Creates a new JndiPermission with actions
     *
     * @param String - JNDI resource path name
     * @param String - JNDI actions (none defined)
     */
    public JndiPermission(String name, String actions) {
        super(name,actions);
    }

}