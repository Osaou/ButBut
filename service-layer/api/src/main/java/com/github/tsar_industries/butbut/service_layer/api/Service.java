package com.github.tsar_industries.butbut.service_layer.api;


import java.util.Optional;

public interface Service
{
	Optional<Image> getImage(String query);
}
