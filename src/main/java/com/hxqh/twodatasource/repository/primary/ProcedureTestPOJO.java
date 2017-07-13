package com.hxqh.twodatasource.repository.primary;

import javax.persistence.*;

/**
 * Created by Ocean lin on 2017/7/13.
 */

//@Entity
//@Table(name = "MYTABLE")
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name = "in_only_test",
        procedureName = "test_pkg.in_only_test",
        parameters = {
        @StoredProcedureParameter(mode = ParameterMode.IN,name = "inParam1", type = String.class)}),
        @NamedStoredProcedureQuery(name = "in_and_out_test",procedureName = "test_pkg.in_and_out_test",
        parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "inParam1", type = String.class),
                @StoredProcedureParameter(mode = ParameterMode.OUT, name = "outParam1", type = String.class)})})
public class ProcedureTestPOJO {

}
