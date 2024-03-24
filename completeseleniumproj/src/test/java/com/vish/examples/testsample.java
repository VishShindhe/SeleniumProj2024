 package com.vish.examples;

import java.util.Map;
import java.util.HashMap;
import org.assertj.core.api.Assertions;

public class testsample {

    public static void main(String[] args)
    {

        Map<String, String> map = new HashMap<>();
        map.put("name","Vishwa");
        map.put("location", "Bangalore");
        map.put("game","cricket");
        Assertions.assertThat(map)
                .containsEntry("name", "Vishsswa")
                .hasSize(3)
                .isNotEmpty()
                .doesNotContainEntry("fav", "hockey")
                .doesNotContainKey("Game")
                .containsKey("location")
                .containsValue("cricket");

        System.out.println("Hi");
    }
}

