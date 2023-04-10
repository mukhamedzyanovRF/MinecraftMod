package com.aeresilf.dop193.item;

import com.aeresilf.dop193.dop193;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    //поставщик для регистрации объектов
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, dop193.MOD_ID);

    //метод регистрации в потоке событий
    public static  void  register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    //добавление предмета
    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));
}
