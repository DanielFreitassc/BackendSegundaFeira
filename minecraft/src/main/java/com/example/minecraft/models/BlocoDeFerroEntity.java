package com.example.minecraft.models;

public class BlocoDeFerroEntity extends BlocoEntity{
    String itemNome = "";
    public BlocoDeFerroEntity(String itemNome) {
        this.itemNome = itemNome;
    }
    @Override
    public ItemEntity destruir() {
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setNome(itemNome);
        return itemEntity;
    }
    
    
}
