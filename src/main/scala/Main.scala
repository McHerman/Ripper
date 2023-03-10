import chisel3._
import chisel3.experimental._
import chisel3.util._
import scala.xml._
import java.io._
import java.io.File
import java.util.Arrays;
import Assembler._

class MemPort(VectorRegisterLength: Int) extends Bundle{
  val Address = Output(UInt(24.W))
  val WriteData = Output(Vec(VectorRegisterLength,UInt(24.W)))
  val Enable = Output(Bool())
  val Len = Output(UInt(6.W))
  val WriteEn = Output(Bool())

  val ReadData = Input(Vec(VectorRegisterLength,UInt(24.W)))
  val Completed = Input(Bool())
  val ReadValid = Input(Bool())
  val Ready = Input(Bool())
}


class Main() extends Module {
    val io = IO(new Bundle {
    //val Sub_IO = new CAP_IO
    val In = Input(UInt(24.W))
    val Out = Output(UInt(24.W))
  })
  val SPI_Out = IO(new Bundle{
    val SCLK = Output(Bool())
    val CE = Output(Bool())
    val SO = Input(Vec(4,Bool()))
    val SI = Output(Vec(4,Bool()))
    val Drive = Output(Bool())
  })

  
}

// generate Verilog
object DSP extends App {


  (new chisel3.stage.ChiselStage).emitVerilog(new APA24(100000000, xml))
}


