/*
 * Copyright 2023 National Bank of Belgium
 * 
 * Licensed under the EUPL, Version 1.2 or – as soon they will be approved 
 * by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * 
 * https://joinup.ec.europa.eu/software/page/eupl
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and 
 * limitations under the Licence.
 */
package jdplus.dfm.base.api;

import jdplus.toolkit.base.api.timeseries.TimeSelector;


/**
 *
 * @author palatej
 */
@lombok.Value
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PrincipalComponentSpec {
    

    public static final double DEF_NS = .80;
    boolean enabled;
    TimeSelector span;
    double nonMissingThreshold;
    
    public static Builder builder(){
        return new Builder()
                .nonMissingThreshold(DEF_NS)
                .span(TimeSelector.all());
    }
    
    public static final PrincipalComponentSpec DEFAULT_ENABLED=builder()
            .enabled(true).build(), DEFAULT_DISABLED=builder().build();
}
