package tw.cchs.computerstore.store.dao.impl;

import tw.cchs.computerstore.store.dao.GoodsDao;
import tw.cchs.computerstore.store.domain.Goods;

import java.util.List;

public class GoodsDaoImpl implements GoodsDao {

    @Override
    public void create(Goods goods) {

    }

    @Override
    public Goods findByPk(Long pk) {
        return null;
    }

    @Override
    public List<Goods> findAll() {
        return List.of();
    }

    @Override
    public void modify(Goods goods) {

    }

    @Override
    public void remove(Long pk) {

    }

}
