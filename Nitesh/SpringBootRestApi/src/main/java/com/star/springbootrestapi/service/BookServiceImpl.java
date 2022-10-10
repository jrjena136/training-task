package com.star.springbootrestapi.service;

import com.star.springbootrestapi.entity.Books;
import com.star.springbootrestapi.repository.IBookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService{

    @Autowired
    IBookDao iBookDao;


    @Override
    public Books addBooks(Books books) {
        return iBookDao.save(books);
    }

    @Override
    public Books updateBooks(Books books) {
        return iBookDao.save(books);
    }

    @Override
    public Books selectByID(int id) {
        return iBookDao.findById(id).get();  //or we can write as iBookDao.findById(id).orElse(null)
    }

    @Override
    public void deleteById(int id) {
        iBookDao.deleteById(id);
    }

    @Override
    public List<Books> selectAllBooks() {
        return iBookDao.findAll();
    }

    @Override
    public Books selectByBname(String bname) {
        return iBookDao.findByBname(bname);
    }

    @Override
    public List<Books> selectByBpriceGT(int bprice) {
        return iBookDao.findByBpriceGreaterThan(bprice);
    }

    @Override
    public List<Books> selectsortedBprice(int bprice) {
        return iBookDao.findBySortedPrice(bprice);
    }

    @Override
    public int findMaxPrice() {
        return iBookDao.findMaxPrice();
    }

}
