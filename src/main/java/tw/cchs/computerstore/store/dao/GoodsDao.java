package tw.cchs.computerstore.store.dao;

import tw.cchs.computerstore.store.domain.Goods;

import java.util.List;

public interface GoodsDao {

    public void create(Goods goods);

    public Goods findByPk(Long pk);

    public List<Goods> findAll();

    public void modify(Goods goods);

    public void remove(Long pk);

}
