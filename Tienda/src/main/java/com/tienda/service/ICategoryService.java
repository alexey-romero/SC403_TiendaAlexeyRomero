package com.tienda.service;

import com.tienda.entities.Category;
import java.util.List;

public interface ICategoryService extends IBaseService<Category, Integer> {

}

//public interface ICategoryService extends IBaseService<Category, Integer> {
//    // Se obtiene un listado de Categories en un List
//    public List<Category> getCategories(boolean activos);
//
//    // Se obtiene un Category, a partir del id de un Category
//    public Category getCategory(Category category);
//
//    /* Se inserta un nuevo Category si el id del Category esta vacio
//       Se actualiza un Category si el id del Category no esta vacio */
//    public void save(Category category);
//
//    // Se elimina el Category que tiene el id pasado por parametro
//    public void delete(Category category);
//}