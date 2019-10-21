package ru.itvitality.sbrf.cu.jfs.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DIYarrayListTest{

    @Test
    @DisplayName( "Проверяем создание пустого листа" )
    public void testSimpleCreate(){
        List<Integer> list = new DIYarrayList<>();
        assertTrue(list.isEmpty());
    }
}

