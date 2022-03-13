/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2015-2022 Andres Almiray
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
package org.kordamp.ikonli.carbonicons;

import org.kordamp.ikonli.IkonProvider;

/**
 * @author Andres Almiray
 */
@org.kordamp.jipsy.annotations.ServiceProviderFor(IkonProvider.class)
public class CarbonIconsIkonProvider implements IkonProvider<CarbonIcons> {
    @Override
    public Class<CarbonIcons> getIkon() {
        return CarbonIcons.class;
    }
}