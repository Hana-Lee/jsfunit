/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.jsfunit.api;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;

/**
 * Annotation specifies the first JSF page visited by the emulated browser.
 * This annotation is required for injection of JSFSession, JSFClientSession,
 * and JSFServerSession.
 *
 * Note that the initialPage param should be something that maps into the FacesServlet.
 * In the case where the FacesServlet is extension mapped in web.xml, this param will be something
 * like @InitialPage("/index.jsf") or @InitialPage("/index.faces").  If the FacesServlet is path-mapped then the
 * initialPage param will be something like @Initialpage("/faces/index.jsp").
 *
 * @author Stan Silvert
 */
@Target({METHOD, TYPE})
@Inherited
@Documented
@Retention(RUNTIME)
public @interface InitialPage {
   public String value();
}
