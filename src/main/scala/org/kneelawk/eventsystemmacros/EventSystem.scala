package org.kneelawk.eventsystemmacros

import scala.language.experimental.macros
import scala.annotation.compileTimeOnly
import scala.annotation.StaticAnnotation
import scala.reflect.macros.whitebox.Context

@compileTimeOnly("Enable macro paradise to expand macro annotations")
class EventSystem extends StaticAnnotation {
  def macroTransform(annottees: Any*): Any = macro EventSystemMacro.impl
}

private object EventSystemMacro {
  def impl(c: Context)(annottees: c.Expr[Any]*): c.Expr[Any] = {
    null
  }
}