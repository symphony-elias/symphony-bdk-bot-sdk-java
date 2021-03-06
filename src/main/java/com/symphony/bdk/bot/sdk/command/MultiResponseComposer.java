package com.symphony.bdk.bot.sdk.command;

/**
 * Abstraction of composer to be used by developers to bind messages to recipient streams
 *
 * @author Gabriel Berberian
 */
public interface MultiResponseComposer {

  /**
   * Starts the response composition
   *
   * @return an instance of ComposerMessageDefinition
   */
  ComposerMessageDefinition compose();

  /**
   * Expose composer complete status
   *
   * @return true if response composition is done, false otherwise
   */
  boolean isComplete();
}
