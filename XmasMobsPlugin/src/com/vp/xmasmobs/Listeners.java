package com.vp.xmasmobs;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.Arrays;



public class Listeners implements Listener {


    @EventHandler
    public void creatureSpawn(CreatureSpawnEvent event) {

        if(event.getEntityType() == EntityType.ZOMBIE) {

            Zombie zombie = (Zombie) event.getEntity();
            {



                ItemStack LeatherBoots1 = new ItemStack(Material.LEATHER_BOOTS);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherBoots1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Boots");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.WHITE);
                    LeatherBoots1.setItemMeta(meta);
                    zombie.getEquipment().setBoots(LeatherBoots1);
                }


                ItemStack LeatherHelmet1 = new ItemStack(Material.LEATHER_HELMET);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherHelmet1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Helmet");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.RED);
                    LeatherHelmet1.setItemMeta(meta);
                    zombie.getEquipment().setHelmet(LeatherHelmet1);
                }

                ItemStack LeatherChestplate1 = new ItemStack(Material.LEATHER_CHESTPLATE);
                {
                LeatherArmorMeta meta = (LeatherArmorMeta) LeatherChestplate1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Chestplate");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                meta.setColor(Color.RED);
                LeatherChestplate1.setItemMeta(meta);
                zombie.getEquipment().setChestplate(LeatherChestplate1);
                }


            }


        }

        if(event.getEntityType() == EntityType.SKELETON) {

            Skeleton skeleton = (Skeleton) event.getEntity();
            {



                ItemStack LeatherBoots1 = new ItemStack(Material.LEATHER_BOOTS);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherBoots1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Boots");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.WHITE);
                    LeatherBoots1.setItemMeta(meta);
                    skeleton.getEquipment().setBoots(LeatherBoots1);
                }


                ItemStack LeatherHelmet1 = new ItemStack(Material.LEATHER_HELMET);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherHelmet1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Helmet");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.RED);
                    LeatherHelmet1.setItemMeta(meta);
                    skeleton.getEquipment().setHelmet(LeatherHelmet1);
                }

                ItemStack LeatherChestplate1 = new ItemStack(Material.LEATHER_CHESTPLATE);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherChestplate1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Chestplate");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.RED);
                    LeatherChestplate1.setItemMeta(meta);
                    skeleton.getEquipment().setChestplate(LeatherChestplate1);
                }


            }


        }


        if(event.getEntityType() == EntityType.WITHER_SKELETON) {

            WitherSkeleton witherSkeleton = (WitherSkeleton) event.getEntity();
            {



                ItemStack LeatherBoots1 = new ItemStack(Material.LEATHER_BOOTS);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherBoots1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Boots");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.WHITE);
                    LeatherBoots1.setItemMeta(meta);
                    witherSkeleton.getEquipment().setBoots(LeatherBoots1);
                }


                ItemStack LeatherHelmet1 = new ItemStack(Material.LEATHER_HELMET);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherHelmet1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Helmet");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.RED);
                    LeatherHelmet1.setItemMeta(meta);
                    witherSkeleton.getEquipment().setHelmet(LeatherHelmet1);
                }

                ItemStack LeatherChestplate1 = new ItemStack(Material.LEATHER_CHESTPLATE);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherChestplate1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Chestplate");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.RED);
                    LeatherChestplate1.setItemMeta(meta);
                    witherSkeleton.getEquipment().setChestplate(LeatherChestplate1);
                }


            }


        }

        if(event.getEntityType() == EntityType.ZOMBIE_VILLAGER) {

            ZombieVillager zombieVillager = (ZombieVillager) event.getEntity();
            {



                ItemStack LeatherBoots1 = new ItemStack(Material.LEATHER_BOOTS);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherBoots1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Boots");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.WHITE);
                    LeatherBoots1.setItemMeta(meta);
                    zombieVillager.getEquipment().setBoots(LeatherBoots1);
                }


                ItemStack LeatherHelmet1 = new ItemStack(Material.LEATHER_HELMET);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherHelmet1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Helmet");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.RED);
                    LeatherHelmet1.setItemMeta(meta);
                    zombieVillager.getEquipment().setHelmet(LeatherHelmet1);
                }

                ItemStack LeatherChestplate1 = new ItemStack(Material.LEATHER_CHESTPLATE);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherChestplate1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Chestplate");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.RED);
                    LeatherChestplate1.setItemMeta(meta);
                    zombieVillager.getEquipment().setChestplate(LeatherChestplate1);
                }


            }


        }

        if(event.getEntityType() == EntityType.ZOMBIFIED_PIGLIN) {

            PigZombie pigZombie = (PigZombie) event.getEntity();
            {



                ItemStack LeatherBoots1 = new ItemStack(Material.LEATHER_BOOTS);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherBoots1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Boots");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.WHITE);
                    LeatherBoots1.setItemMeta(meta);
                    pigZombie.getEquipment().setBoots(LeatherBoots1);
                }


                ItemStack LeatherHelmet1 = new ItemStack(Material.LEATHER_HELMET);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherHelmet1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Helmet");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.RED);
                    LeatherHelmet1.setItemMeta(meta);
                    pigZombie.getEquipment().setHelmet(LeatherHelmet1);
                }

                ItemStack LeatherChestplate1 = new ItemStack(Material.LEATHER_CHESTPLATE);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherChestplate1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Chestplate");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.RED);
                    LeatherChestplate1.setItemMeta(meta);
                    pigZombie.getEquipment().setChestplate(LeatherChestplate1);
                }


            }


        }

        if(event.getEntityType() == EntityType.PIGLIN) {

            Piglin piglin = (Piglin) event.getEntity();
            {


                ItemStack LeatherBoots1 = new ItemStack(Material.LEATHER_BOOTS);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherBoots1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Boots");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.WHITE);
                    LeatherBoots1.setItemMeta(meta);
                    piglin.getEquipment().setBoots(LeatherBoots1);
                }


                ItemStack LeatherHelmet1 = new ItemStack(Material.LEATHER_HELMET);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherHelmet1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Helmet");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.RED);
                    LeatherHelmet1.setItemMeta(meta);
                    piglin.getEquipment().setHelmet(LeatherHelmet1);
                }

                ItemStack LeatherChestplate1 = new ItemStack(Material.LEATHER_CHESTPLATE);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherChestplate1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Chestplate");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.RED);
                    LeatherChestplate1.setItemMeta(meta);
                    piglin.getEquipment().setChestplate(LeatherChestplate1);
                }


            }


        }

        if(event.getEntityType() == EntityType.HUSK) {

            Husk husk = (Husk) event.getEntity();
            {


                ItemStack LeatherBoots1 = new ItemStack(Material.LEATHER_BOOTS);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherBoots1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Boots");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.WHITE);
                    LeatherBoots1.setItemMeta(meta);
                    husk.getEquipment().setBoots(LeatherBoots1);
                }


                ItemStack LeatherHelmet1 = new ItemStack(Material.LEATHER_HELMET);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherHelmet1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Helmet");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.RED);
                    LeatherHelmet1.setItemMeta(meta);
                    husk.getEquipment().setHelmet(LeatherHelmet1);
                }

                ItemStack LeatherChestplate1 = new ItemStack(Material.LEATHER_CHESTPLATE);
                {
                    LeatherArmorMeta meta = (LeatherArmorMeta) LeatherChestplate1.getItemMeta();
                    meta.setDisplayName(ChatColor.GOLD + "Xmas Chestplate");
                    meta.setLore(Arrays.asList("Only the people that Santa trust's wear's these."));
                    meta.setColor(Color.RED);
                    LeatherChestplate1.setItemMeta(meta);
                    husk.getEquipment().setChestplate(LeatherChestplate1);
                }


            }


        }







    }

}
