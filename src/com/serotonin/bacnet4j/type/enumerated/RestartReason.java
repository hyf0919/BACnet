/*
 * ============================================================================
 * GNU Lesser General Public License
 * ============================================================================
 *
 * Copyright (C) 2006-2009 Serotonin Software Technologies Inc. http://serotoninsoftware.com
 * @author Matthew Lohbihler
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
 */
package com.serotonin.bacnet4j.type.enumerated;

import com.serotonin.bacnet4j.type.primitive.Enumerated;
import com.serotonin.util.queue.ByteQueue;

public class RestartReason extends Enumerated {
    private static final long serialVersionUID = -4199348259202899844L;
    public static final RestartReason unknown = new RestartReason(0);
    public static final RestartReason coldstart = new RestartReason(1);
    public static final RestartReason warmstart = new RestartReason(2);
    public static final RestartReason detectedPowerLost = new RestartReason(3);
    public static final RestartReason detectedPoweredOff = new RestartReason(4);
    public static final RestartReason hardwareWatchdog = new RestartReason(5);
    public static final RestartReason softwareWatchdog = new RestartReason(6);
    public static final RestartReason suspended = new RestartReason(7);

    public RestartReason(int value) {
        super(value);
    }

    public RestartReason(ByteQueue queue) {
        super(queue);
    }
}