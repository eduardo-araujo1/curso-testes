package com.eduardo.demo.domain;

import static com.eduardo.demo.common.PlanetConstants.PLANET;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {
    @Autowired
    private PlanetService planetService;
    @MockBean
    private PlanetRepository planetRepository;

    @Test
    public void createPlanet_WithValidData_ReturnsPlanet(){
       ///AAA
       ///Arrange
        when(planetRepository.save(PLANET)).thenReturn(PLANET);
        ///Act
        //sut = system under test
       Planet sut = planetService.create(PLANET);
       ///Assert
       assertThat(sut).isEqualTo(PLANET);
    }
}
