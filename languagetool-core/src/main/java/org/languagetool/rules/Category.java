/* LanguageTool, a natural language style checker 
 * Copyright (C) 2006 Daniel Naber (http://www.danielnaber.de)
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package org.languagetool.rules;

/**
 * A rule's category. Categories are used to group rules for
 * a better overview.
 * 
 * @author Daniel Naber
 */
public final class Category {

  public enum Location {
    /** The rules in this category are part of the main distribution of
     * LanguageTool and are thus available on <a href="http://community.languagetool.org">community.languagetool.org</a>. */
    INTERNAL,
    /** The rules in this category are not part of the main distribution of LanguageTool. */
    EXTERNAL
  }

  private final String name;
  private final Location location;
  private final boolean defaultOff;

  /**
   * Create a new category.
   * @param name name of the category
   */
  public Category(final String name) {
    this(name, Location.INTERNAL);
  }

  /**
   * Create a new category.
   * @param name name of the category
   * @since 2.8
   */
  public Category(String name, Location location) {
    this(name, location, true);
  }

  /**
   * Create a new category.
   * @param name name of the category
   * @since 2.9
   */
  public Category(String name, Location location, boolean onByDefault) {
    this.name = name;
    this.location = location;
    this.defaultOff = !onByDefault;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name;
  }

  /**
   * Checks whether the category has been turned off
   * by default by the category author.
   * @return True if the category is turned off by default.
   */
  public boolean isDefaultOff() {
    return defaultOff;
  }

  /**
   * @since 2.8
   */
  public Location getLocation() {
    return location;
  }

}
