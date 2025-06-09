package com.example.DemoEmployee.entity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data-table-metadata")
public class DataTableMetadataController {

    private static final DataTableMetadata Employee_METADATA;

    static {
        Employee_METADATA = new DataTableMetadata()
                .addColumnMetadata(new ColumnMetadata("", "empId", ColumnType.RADIO, 30))
                .addColumnMetadata(new ColumnMetadata("Name", "empName", ColumnType.TEXT, 30))
                .addColumnMetadata(new ColumnMetadata("Email", "email", ColumnType.TEXT, 40));
               

        

    }

    @GetMapping("/employee")
    public DataTableMetadata getNumberTypeDataTableMetadata() {
        return Employee_METADATA;
    }
}
