/**
 * Copyright 2013 Nils Assbeck, Guersel Ayaz and Michael Zoech
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tech.treeentertainment.a_ucam.ptp.commands.eos;

import tech.treeentertainment.a_ucam.ptp.EosCamera;
import tech.treeentertainment.a_ucam.ptp.commands.Command;

public abstract class EosCommand extends Command {

    protected EosCamera camera;

    public EosCommand(EosCamera camera) {
        super(camera);
        this.camera = camera;
    }
}
