package cn.bruce.spring.basic_dl.b_quickstart_bytype.dao.impl;

import cn.bruce.spring.basic_dl.b_quickstart_bytype.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

/**
 * @author Bruce
 * @create 2021-08-02 11:13
 */
public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("aaa", "bbb", "ccc");
    }
}
