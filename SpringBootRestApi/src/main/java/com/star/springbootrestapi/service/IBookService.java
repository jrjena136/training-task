package com.star.springbootrestapi.service;

import com.star.springbootrestapi.entity.Books;

import java.util.List;

public interface IBookService {

    public Books addBooks(Books books);
    public Books updateBooks(Books books);

    public Books selectByID(int id);
    public void deleteById(int id);

    public List<Books> selectAllBooks();

    public Books selectByBname(String bname);

    public List<Books> selectByBpriceGT(int bprice);

    public List<Books> selectsortedBprice(int bprice);

    public int findMaxPrice();



}
