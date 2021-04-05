package com.sumit.pack.mapper;

//import com.sumit.pack.entities.Employee;
import com.sumit.pack.models.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    //Entity to Model
    Employee empEntityToEmpModel(com.sumit.pack.entities.Employee employee);

    //Model To Entity
    com.sumit.pack.entities.Employee empModelToEmpEntity(Employee employee);
}
