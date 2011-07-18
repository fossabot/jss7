/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and/or its affiliates, and individual
 * contributors as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a full listing
 * of individual contributors.
 * 
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License, v. 2.0.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License,
 * v. 2.0 along with this distribution; if not, write to the Free 
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
package org.mobicents.protocols.ss7.map.api.service.lsm;

import org.mobicents.protocols.ss7.map.api.primitives.ISDNAddressString;
import org.mobicents.protocols.ss7.map.api.primitives.MAPExtensionContainer;

/**
 * 
 * RoutingInfoForLCS-Arg ::= SEQUENCE {
 *		mlcNumber [0] ISDN-AddressString,
 *		targetMS [1] SubscriberIdentity,
 *		extensionContainer [2] ExtensionContainer OPTIONAL,
...}


 * @author amit bhayani
 *
 */
public interface SendRoutingInfoForLCSRequestIndication extends LsmMessage {
	public ISDNAddressString getMLCNumber();
	
	public SubscriberIdentity getTargetMS();
	
	public MAPExtensionContainer getExtensionContainer();
	
}
