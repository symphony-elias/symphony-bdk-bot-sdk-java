package com.symphony.ms.songwriter.internal.scan;

import java.util.Set;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AssignableTypeFilter;

public abstract class BaseBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

  private static final String BASE_PACKAGE_SCAN = "com.symphony.ms.songwriter";

  protected <T> Set<BeanDefinition> scanComponents(Class<T> clazz) {
    ClassPathScanningCandidateComponentProvider provider =
        new ClassPathScanningCandidateComponentProvider(false);

    provider.addIncludeFilter(new AssignableTypeFilter(clazz));

    return provider.findCandidateComponents(BASE_PACKAGE_SCAN);

  }

  @Override
  public abstract void postProcessBeanFactory(
      ConfigurableListableBeanFactory beanFactory);
}