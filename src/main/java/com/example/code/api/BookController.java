package com.example.code.api;

import com.example.code.model.dto.response.ResponseAvailableBook;
import com.example.code.services.WarehouseService.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final WarehouseService warehouseService;

    @Autowired
    public BookController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @GetMapping
    public List<ResponseAvailableBook> getAvailableBooks() {
        return warehouseService.getAllAvailableBooks();
    }
}
