package com.star.springbootrestapi.controller;


import com.star.springbootrestapi.entity.Books;
import com.star.springbootrestapi.service.BookServiceImpl;
import com.star.springbootrestapi.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    IBookService bookService;

    @GetMapping("/getAllBooks")
    private List<Books> getAllBooks(){
        return bookService.selectAllBooks();
    }

    @GetMapping("/getBook/{bookid}")
    private Books getBookById(@PathVariable("bookid") int id ){
        return bookService.selectByID(id);
    }


    //@RequestBody convert the json into java and store it
    @PostMapping("/addbooks")
    private Books addBooks(@RequestBody Books book){
        return bookService.addBooks(book);
    }

    @PostMapping("/updatebooks")
    private Books updateBooks(@RequestBody Books book){
        return bookService.updateBooks(book);
    }

    @PostMapping("/delete/{bookid}")
    private void deleteById(@PathVariable("bookid") int id){
        bookService.deleteById(id);
        System.out.println("Record Deleted successfully");
    }

    @GetMapping("/get/ename/{bname}")
    public Books selectByBname(@PathVariable("bname") String bname){
        return bookService.selectByBname(bname);
    }

    @GetMapping("/get/price/{bprice}")
    public List<Books> selectByBpriceGT(@PathVariable("bprice") int bprice){
        return bookService.selectByBpriceGT(bprice);
    }

    @GetMapping("/get/sortprice/{bprice}")
    public List<Books> selectsortedByprice(@PathVariable("bprice") int bprice){
        return bookService.selectsortedBprice(bprice);
    }

    @GetMapping("/get/maxprice")
    public int findMaxPrice(){
        return bookService.findMaxPrice();
    }

}
