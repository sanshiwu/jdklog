package org.jdklog.logging.core.queue;

import org.jdklog.logging.api.metainfo.Record;

/**
 * This is a class description.
 *
 * <p>Another description after blank line.
 *
 * @author admin
 */
public class FileQueue extends AbstractQueue<Record> {

  /** 阻塞队列名称,按照业务划分. */
  private final String target;

  /**
   * This is a method description.
   *
   * <p>Another description after blank line.
   *
   * @param target .
   * @author admin
   */
  public FileQueue(final String target) {
    this.target = target;
  }

  /**
   * This is a method description.
   *
   * <p>Another description after blank line.
   *
   * @param capacity .
   * @param target .
   * @author admin
   */
  public FileQueue(final int capacity, final String target) {
    super(capacity);
    this.target = target;
  }

  @Override
  public final String getTarget() {
    return this.target;
  }
}
